- name: Deploy to Kubernetes
  hosts: localhost
  tasks:
    - name: Create Pod
      k8s:
        state: present
        definition: "{{ lookup('file', 'pod.yaml') }}"

    - name: Create Service
      k8s:
        state: present
        definition: "{{ lookup('file', 'service.yaml') }}"

    - name: Create Deployment
      k8s:
        state: present
        definition: "{{ lookup('file', 'deployment.yaml') }}"
